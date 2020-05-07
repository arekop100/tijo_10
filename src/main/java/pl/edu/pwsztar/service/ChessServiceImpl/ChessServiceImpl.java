package pl.edu.pwsztar.service.ChessServiceImpl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.pwsztar.domain.checking.MoveChecking;
import pl.edu.pwsztar.domain.dto.FigureMoveDto;
import pl.edu.pwsztar.domain.enums.FigureType;
import pl.edu.pwsztar.service.ChessService;

@Service
public class ChessServiceImpl implements ChessService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChessServiceImpl.class);

    private final MoveChecking moveChecking;

    @Autowired
    ChessServiceImpl(MoveChecking moveChecking){
        this.moveChecking = moveChecking;
    }


    @Override
    public Boolean isMoveCorrect(FigureMoveDto figureMoveDto) {

        boolean moveCorrect = false;

        moveCorrect = moveChecking.checkBishop(figureMoveDto);

        return moveCorrect;
    }
}
